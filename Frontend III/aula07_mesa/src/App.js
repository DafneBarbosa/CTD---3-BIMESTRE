
import {useState} from 'react';
import './styles.css';
import Button from './components/Button/index';
import tasksTemp from './data';
import Item from './components/Item/index';

const task = {
  id: '1',
  nome: 'Fazer café',
  status: false
};

function App() {

  const[textInput, setTextoInput] = useState("");

  const[tasks, setTasks] = useState(tasksTemp);

  function addItem(){
    const newTask = {
      id: Date.now(), //valor aleatório, pega o tempo em milisegundos ou posso pegar o tamanho do array+1
      nome: textInput,
      status: false
    }
    setTasks([...tasks, newTask]);
    setTextoInput(""); //limpa o textinput
  }

  function deletItem(id){
    const temp = tasks.filter((item)=>item.id!==id);
    setTasks([...temp]);
    console.log(temp);
  }

  function handleTextInput(event){
      setTextoInput(event.target.value);
  }


  return (
    <>
      <header className="header">
        <input value={textInput} className="input_tarefas" placeholder="Insira uma tarefa" onChange={(event)=>handleTextInput(event)}/>
        <div className="button_container">
          <Button text="Adicionar" onClick={addItem}/>
          <Button text="Limpar"/>
        </div>
      </header>

      <main>
        { 
          
        }

        {tasks.length > 0 ? 
          (tasks.map((task)=>
          <div>
            <Item key={tasks.id} id={task.id} nome={task.nome} checked={task.status} funcaoApagar={deletItem}/>
          </div>)) 
          : (<span>Nenhuma tarefa adicionada</span>)}
      </main>
    </>
    
  );
}

export default App;
