
import tasks from '../../data';
import './styles.css';

export default function Item(props){
    return(
        <div className="container">
            <div>
                <input type="checkbox" defaultChecked={props.checked}/>
                <span className={props.checked === true ? "tarefa_feita" : "tarefa_a_fazer"}>{props.nome}</span>
            </div>
            <button onClick={()=>props.funcaoApagar(props.id)}>Apagar</button>
        </div>
    )
}