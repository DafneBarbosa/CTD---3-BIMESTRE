
export default function Cachorro(props) {
    return (
        <ul>
            <h2>Nome: {props.nome}</h2>
            <li>Idade: {props.idade} meses</li>
        </ul>
    );
}