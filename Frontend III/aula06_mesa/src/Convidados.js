import React, { Component } from 'react'

export default class ClassComponent extends Component {
   render() {
       return (
           <li>{this.props.nome} está convidado para festa</li>
       )
   }
}
