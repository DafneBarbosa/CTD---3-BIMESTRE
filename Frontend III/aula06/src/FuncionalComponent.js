

export default function FuncionalComponent(props){

    function handleClick(){
        alert(props.nome);
    }
    return(
        <>
        <h1>Hello FuncionalComponent</h1>
        <button onClick={handleClick}>Aperte</button>
        </>
    )
}