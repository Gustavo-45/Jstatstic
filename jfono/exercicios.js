
        const frm = document.querySelector("form")
       const nome = document.getElementById("inNome")

       frm.addEventListener("submit",(e)=>{
        console.log(nome.value);
        e.preventDefault()
       })
      

