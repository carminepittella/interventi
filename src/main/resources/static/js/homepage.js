document.addEventListener("DOMContentLoaded", function () {
    // Funzione per calcolare il totale degli elementi nella tabella
    function calculateTotalElements() {
        const rows = document.querySelectorAll("tbody tr"); // Seleziona tutte le righe nel corpo della tabella
        const totalElements = rows.length; // Conta il numero di righe

        // Aggiorna il contenuto del footer con il totale degli elementi
        document.getElementById("total-elements").textContent = `Totale: ${totalElements}`;
    }

    // Calcola il totale al caricamento della pagina
    calculateTotalElements();
});