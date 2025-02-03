// Funzione per popolare la tabella
function populateTable(data) {
    const tbody = document.getElementById('interventi-body');
    tbody.innerHTML = ''; // Svuota la tabella
    data.forEach(intervento => {
        const row = document.createElement('tr');
        row.innerHTML = `
                <td>${formatDate(intervento.dataIntervento)}</td>
                <td>${intervento.descrizioneIntervento}</td>
                <td>${intervento.tipoImpianto.descrizioneTipoImpianto}</td>
                <td>${intervento.struttura.nomeStruttura}</td>
                <td>${intervento.medico.nome} ${intervento.medico.cognome}</td>
                <td>${intervento.azienda.nomeAzienda}</td>
                <td>${intervento.specialist.specialista}</td>
            `;
        tbody.appendChild(row);
    });
    // Aggiorna il totale
    document.getElementById('total-elements').textContent = `Totale: ${data.length}`;
}

// Funzione per caricare i dati
async function loadData() {
    try {
        const response = await fetch('/api/interventi');
        if (!response.ok) throw new Error('Errore nel caricamento dei dati');
        const data = await response.json();
        populateTable(data);
    } catch (error) {
        // Gestione errori
        const tbody = document.getElementById('interventi-body');
        tbody.innerHTML = `<tr><td colspan="1" class="text-danger text-center">${error.message}</td></tr>`;
    }
}

// Funzione per formattare la data
function formatDate(dateString) {
    if(!dateString) return 'N/D';
    const date = new Date(dateString);
    if(isNaN(date)) return '-';
    const day = String(date.getDate()).padStart(2, '0');
    const month = String(date.getMonth() + 1).padStart(2, '0');
    const year = date.getFullYear();
    return `${day}-${month}-${year}`;
}

// Carica i dati all'avvio
document.addEventListener('DOMContentLoaded', loadData);