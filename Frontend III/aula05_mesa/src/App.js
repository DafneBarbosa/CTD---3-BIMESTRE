
import Cachorro from './Cachorro';

function App() {
  return (
    <div className="App">
      
      <h1>Clientes caninos da veterinaria</h1>

      <Cachorro nome='Spyke' idade={2}/>
      <Cachorro nome='Marley'idade={3}/>
      <Cachorro nome='Bombom'idade={4}/>

    </div>
  );
}

export default App;
