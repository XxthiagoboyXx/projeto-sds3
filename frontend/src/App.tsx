import DataTable from "components/DataTable";
import Footer from "components/Footer";
import NavBar from "components/NavBar";

function App() {
  return (
    <> {/*<> e </> é conhecido como fragment e server para burlar a checagem do retorno da função só ter um elemento */}
      <NavBar />
      <div className="container"> {/*essa classe container é padrão da bootstrap e serve para alinhar o elemento*/}
        <h1 className="text-primary">Fala cachorra!</h1>
        <DataTable />
      </div>

      <Footer />
    </>
  );
}

export default App;
