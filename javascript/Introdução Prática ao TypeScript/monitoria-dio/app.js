"use strict";
function somaValoresNumericos(numero1, numero2) {
    return numero1 + numero2;
}
console.log(somaValoresNumericos(1, 3));
function printaValoresNumericos(numero1, numero2) {
    console.log(numero1 + numero2);
}
function somaValoresNumericosETratar(numero1, numero2, callback) {
    var resultado = numero1 + numero2;
    return callback(resultado);
}
function aoQuadrado(numero) {
    return numero * numero;
}
function dividirPorEleMesmo(numero) {
    return numero / numero;
}
console.log(somaValoresNumericosETratar(1, 3, aoQuadrado));
console.log(somaValoresNumericosETratar(1, 3, dividirPorEleMesmo));
