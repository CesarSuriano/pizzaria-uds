import React, { Component } from 'react';
import './Tamanho.css';

class Tamanho extends Component {
  render() {
    return (
      <div>
      <div class="conteudo">
        <h2>Selecione o tamanho de sua pizza</h2>
        <a><div class="card">Grande</div></a>
        <a><div class="card">Média</div></a>
        <a><div class="card">Pequena</div></a>
        <button>ESCOLHER O SABOR</button>
      </div>
    </div>
    );
  }
}

export default Tamanho;
