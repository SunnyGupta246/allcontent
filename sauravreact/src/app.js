import React,{Component} from 'react';
import Sunny from './Sunny';

//Class bases component
//state
export default class App extends Component {
    constructor(props){
        super(props);
        this.state={
            rollNo: "49",
            name1 : this.props.name
        }
    }
    // handleing = this.handleing.bind(this);
    // change(){
    //     this.setState({name1:"saurav papa"});
    // }

    change=()=>{
        this.setState({name1:"saurav ", rollNo:"44"});
    }

    render(){
        return(
            // <React.Fragment>
            <div>
                <h1>hii darling {this.state.name1} and {this.state.rollNo}</h1>
                <button type="button" onClick={this.change}>Clicke me</button>
                <Sunny name2="sunny"/>
            </div>
            // </React.Fragment>
        )
    }
}

// //Functional based Component
//  const App=(props)=>{
//     return(
//         <div>
//             <h1>hello bkl {props.name}</h1>
//         </div>
//     )
//  }
//  export default App;
//Functional based Component
// function App(props){

//     return(
//         <div>
//             <h1>hello bkl {props.name}</h1>
//         </div>
//     )
//  }
//  export default App;
