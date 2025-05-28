const users = [
    { id: 1, name: 'Alice', lastName: 'Smith', age: 30, isActive: true },
    { id: 2, name: 'Bob', lastName: 'Johnson', age: 24, isActive: false },
    { id: 3, name: 'Charlie', lastName: 'Brown', age: 35, isActive: true },
    { id: 4, name: 'David', lastName: 'Davis', age: 29, isActive: true },
    { id: 5, name: 'Eve', lastName: 'Miller', age: 40, isActive: false },
    { id: 6, name: 'Frank', lastName: 'Wilson', age: 22, isActive: true },
    { id: 7, name: 'Grace', lastName: 'Moore', age: 45, isActive: true },
    { id: 8, name: 'Hannah', lastName: 'Taylor', age: 28, isActive: false },
    { id: 9, name: 'Ivy', lastName: 'Anderson', age: 33, isActive: true },
    { id: 10, name: 'Jack', lastName: 'Thomas', age: 31, isActive: true },
    { id: 11, name: 'Karen', lastName: 'Jackson', age: 27, isActive: false },
    { id: 12, name: 'Liam', lastName: 'White', age: 38, isActive: true },
    { id: 13, name: 'Mia', lastName: 'Harris', age: 26, isActive: true },
    { id: 14, name: 'Noah', lastName: 'Martin', age: 50, isActive: false },
    { id: 15, name: 'Olivia', lastName: 'Thompson', age: 23, isActive: true },
];

// funzione eseguita quando la pagina viene caricata
document.addEventListener('DOMContentLoaded', () => {
    const tabella = document.getElementById('users-table');
    // ES1 riempi la tabella con i dati contenuti nell'array qui sopra

    const bottoneApplica = document.getElementById('apply-filters-btn');
    bottoneApplica.addEventListener('click', () => {
        // ES2 applica i filtri ed aggiorna il contenuto della tabella
    });

    const bottoneReset = document.getElementById('reset-filters-btn');
    bottoneReset.addEventListener('click', () => {
        // ES3 resetta i filtri ed aggiorna il contenuto della tabella
    });
});
