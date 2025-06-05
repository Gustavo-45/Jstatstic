const frm = document.querySelector("form")
const promo = document.querySelector("h2")
const ent = document.querySelector("h3")
const parc = document.querySelector("h4")

frm.addEventListener("submit",(e)=>{
    const titulo = frm.inVeiculo.value
    const valor = Number(frm.inPreco.value)
    const entrada = Math.round(valor/2)
    const parcela = Math.round(entrada/12)
    promo.innerText = `Promoção: ${titulo}`
    ent.innerText = `Entrada de R$: ${entrada}`
    parc.innerText = `+12x de R$ ${parcela}`
    e.preventDefault()
})