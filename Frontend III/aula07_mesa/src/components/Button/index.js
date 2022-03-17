import './styles.css';

export default function Button(props){
    return(
        <button onClick={props.onClick} className={props.text==="Adicionar" ? "button" : "button2"}>{props.text}</button> //se o texto do botao for Adicionar aplica a classe button, se não, aplica a classe button2
    )
}