import React from "react";
import * as ReactDOMClient from 'react-dom/client';

class Tile extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      value: ""
      // value: props.value // this way <Tile value="7"/> will set the initial value as 7
    };
  }

  handleInput = (e) => {
    e.preventDefault();
    const inputValue = e.target.value;
    if (inputValue == "") {
      this.setState({value: inputValue});
    }
    const filteredValue = inputValue.replace(/[^1-9]/g, "");  // explaination in knowledge section
    if (filteredValue != "") {
      this.setState({value: filteredValue});
    } 
    console.log(e.target.value);
  }

  render() {
    return (
      <input
      className="tile"
        type="text"
        maxLength="1"
        onInput={this.handleInput}
        value={this.state.value}
      />
    );
  }
}

class Board extends React.Component {
  render() {
    return (
      <div>
        <div className="board-row">
          <Tile />
          <Tile value="7"/>
          <Tile value="7"/>
          <Tile />
          <Tile />
        </div>
      </div>
    );
  }
}

const root = ReactDOMClient.createRoot(document.getElementById("react-mountpoint"));
root.render(<Board />);
