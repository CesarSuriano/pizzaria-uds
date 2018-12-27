import React, { Component } from 'react';
import './Sabor.css';

class Sabor extends Component {
  render() {
    return (
      <div>
      <header>
        <a href="" class="logo">Logo</a>
        <button>Download</button>
      </header>
      <div class="conteudo">
        <h2>Selecione o sabor de sua pizza</h2>
        <a><div class="card">Calabresa</div></a>
        <a><div class="card">Marquerita</div></a>
        <a><div class="card">Portuguesa</div></a>
        <button>Finalizar meu pedido</button>
      </div>
    </div>
    );
  }
}

export default Sabor;
