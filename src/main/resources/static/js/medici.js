// Funzione per popolare la tabella
function populateTable(data) {
    const tbody = document.getElementById('medici-body');
    tbody.innerHTML = ''; // Svuota la tabella

    data.forEach(medico => {
        const row = document.createElement('tr');
        row.innerHTML = `
                <td>${medico.idMedico}</td>
                <td>${medico.nome}</td>
                <td>${medico.cognome}</td>
            `;
        tbody.appendChild(row);
    });

    // Aggiorna il totale
    document.getElementById('total-elements').textContent = `Totale medici: ${data.length}`;
}

// Funzione per caricare i dati
async function loadData() {
    try {
        const response = await fetch('/api/medici');
        if (!response.ok) throw new Error('Errore nel caricamento dei dati');
        const data = await response.json();
        populateTable(data);
    } catch (error) {
        // Gestione errori
        const tbody = document.getElementById('medici-body');
        tbody.innerHTML = `<tr><td colspan="3" class="text-danger text-center">${error.message}</td></tr>`;
    }
}

// Funzione per refresh dati
function refreshData() {
    loadData();
}

// Carica i dati all'avvio
document.addEventListener('DOMContentLoaded', loadData);