let array = [5, 1, 4, 2];
console.log('array', array);

// incrementa di 1 tutti gli elementi dell'array
let arrayPiuUno = array.map(x => x + 1);
console.log('arraPiuUno', arrayPiuUno);

// seleziona gli elementi dell'array che sono maggiori di 2
let maggioriDiDue = array.filter(x => x > 2);
console.log('maggioriDiDue', maggioriDiDue);

// somma tutti gli elementi dell'array
let somma = array.reduce((acc, x) => x + acc, 0);
console.log('somma', somma);

// queste funzioni si possono anche concatenare
let sommaDeiNumeriPari = array.filter(x => x % 2 == 0).reduce((x, acc) => x + acc);
console.log('sommaDeiNumeriPari', sommaDeiNumeriPari);
