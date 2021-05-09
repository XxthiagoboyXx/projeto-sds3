import BarChart from "components/BarChart";
import DataTable from "components/DataTable";
import DonutChart from "components/DonutChart";
import Footer from "components/Footer";
import NavBar from "components/NavBar";

function Dashboard() {
    return (
        <> {/*<> e </> é conhecido como fragment e server para burlar a checagem do retorno da função só ter um elemento */}
            <NavBar />
            <div className="container"> {/*essa classe container é padrão da bootstrap e serve para alinhar o elemento*/}
                <h1 className="text-primary py-3">Dashboard de Vendas</h1> {/*o py-3 significa, padding na vertical de 3 unideades*/}

                <div className="row px-3"> {/*organiza os componentes da div em uma linha | ja o px-3 significa, padding na horizontal de 3 unideades*/}
                    <div className="col-sm-6"> {/*Coluna com espaço de grade de 6 unidades em relação a unidade de medida do bootstrap | O bootstrap divide seu layout na horizontal em 12 partes, dessa forma 6 é a metade do layout*/}
                        <h5 className="text-center text-secondary">Taxa de Sucesso</h5>
                        <BarChart />
                    </div>
                    <div className="col-sm-6"> {/*Coluna com espaço de grade de 6 unidades em relação a unidade de medida do bootstrap | O bootstrap divide seu layout na horizontal em 12 partes, dessa forma 6 é a metade do layout*/}
                        <h5 className="text-center text-secondary">Taxa de Sucesso</h5>
                        <DonutChart />
                    </div>
                </div>

                <div className="py-3">
                    <h2 className="text-primary">Todas as Vendas</h2>
                </div>

                <DataTable />
            </div>

            <Footer />
        </>
    );
}

export default Dashboard;