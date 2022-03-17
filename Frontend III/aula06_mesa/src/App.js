import ClassComponent from './Convidados';
import FunctionComponent from './Tarefas';
import './styles.css';

function App() {
  return (
    <div className="App">
      <h3>Convidado:</h3>
        <ClassComponent nome="Nicolas" estaNaLista={true} />
        <ClassComponent nome="Pedro" estaNaLista={false} />
        <ClassComponent nome="Carolina" estaNaLista={true} />
     <h3>Tarefas: </h3>
        <FunctionComponent nome="Nicolas" tarefa="batata-frita" />
        <FunctionComponent nome="Pedro" tarefa="pizza" />
        <FunctionComponent nome="Carolina" tarefa="bebidas" />      
    </div>
  );
}

export default App;
