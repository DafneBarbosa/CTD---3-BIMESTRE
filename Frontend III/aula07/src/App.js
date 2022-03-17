import {useState} from "react";

function App() {
  const [numero, setNumero] = useState(1000);
  function handleNumber() {
    setNumero(numero+10);
  }

  const [valorInput, setValorInput] = useState("");

  return (
    <>
      <h1>{numero}</h1>
      <button onClick={handleNumber}>Trocar</button>
      <h1>Input = {valorInput}</h1>
      <input style={{border: "1px solid red"}} onChange={(event)=>setValorInput(event.target.value)}/>
    </>
    
  );
}

export default App;
