import {Component} from "react";

export default class ClassComponent extends Component {

    constructor(props) {
        super(props);
        this.handleClick = this.handleClick.bind(this);
    }

    handleClick(){
        alert("ok "+this.props.nome);
    }

    handleFunction(){}

    render(){
        return (
            <div>
                <h1>Hello ClassComponent {this.props.nome}</h1>
                <button onClick={this.handleClick}>aperte</button>
                <button onClick={()=>alert("ok "+this.props.nome)}>aperte2</button>
                <button onClick={()=>alert("ok "+this.props.nome)}>aperte3</button>
            </div>
        );
    }

}

//Nas classes não chamo o props direto, tenho que chamar this.props.nome
//O this só é conhecido dentro do render, se quiser usar no método handleClick não consigo, por isso vamos criar um construtor pra fazer um bind com nossa função
//Arrowfunctions tem acesso ao this