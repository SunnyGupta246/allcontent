import logo from './logo.svg';
import './App.css';


function App() {
  return (
    //  <div className=="blank">lovely</div>
    // <>
    //   <nav>
    //     <li>Home</li>
    //     <li>About</li>
    //     <li>NUmber</li>
    //   </nav>
    //   <div className=="container">
    //     <h1>hellow {name}</h1>
    //     <p>Lorem ipsum dolor sit, amet consectetur adipisicing elit. Ipsum nostrum quis necessitatibus maxime cupiditate vel unde earum sunt possimus, obcaecati in explicabo tempora facilis iste eius nemo officiis asperiores sed!</p>
    //   </div>
    // </>
    <>
    <nav className="navbar navbar-expand-lg bg-body-tertiary">
  <div className="container-fluid">
    <a className="navbar-brand" href="/">Sunny React</a>
    <button className="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span className="navbar-toggler-icon"></span>
    </button>
    <div className="collapse navbar-collapse" id="navbarSupportedContent">
      <ul className="navbar-nav me-auto mb-2 mb-lg-0">
        <li className="nav-item">
          <a className="nav-link active" aria-current="page" href="/">Home</a>
        </li>
        <li className="nav-item">
          <a className="nav-link" href="/">About</a>
        </li>
       
      </ul>
      <form className="d-flex" role="search">
        <input className="form-control me-2" type="search" placeholder="Search" aria-label="Search"/>
        <button className="btn btn-outline-success" type="submit">Search</button>
      </form>
    </div>
  </div>
</nav>
</>

  );
}

export default App;
