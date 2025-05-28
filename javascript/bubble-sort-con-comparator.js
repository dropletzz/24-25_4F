
// compare(a, b) e' una funzione che resitituisce:
//   * un numero positivo se a > b
//   * 0 se a == b
//   * un numero negativo se a < b
const bubbleSort = (a, compare) => {
    for (let x=0; x<a.length; x++) {
        for (let i=0; i<a.length-1; i++) {
            if (compare(a[i], a[i+1]) > 0) {
                let tmp = a[i];
                a[i] = a[i+1];
                a[i+1] = tmp;
            }
        }
    }
}

const array = [5, 1, 4, 2];

console.log('array originale', array);

bubbleSort(array, (a, b) => a - b);
console.log('ordine crescente', array);

bubbleSort(array, (a, b) => b - a);
console.log('ordine decrescente', array);

const persone = [
    { nome: 'Piero', eta: 19 },
    { nome: 'Moira', eta: 35 },
    { nome: 'Mario', eta: 27 },
    { nome: 'Gigia', eta: 11 },
];

bubbleSort(persone, (x, y) => x.eta - y.eta);
console.log('persone ordinate per eta', persone);
