//gráfico de barras
import Chart from 'react-apexcharts';

function BarChart() {
    const optionsvar = {
        plotOptions: {
            bar: {
                horizontal: true,
            }
        },
    };

    const mockData = {
        labels: {
            categories: ['Anakin', 'Barry Allen', 'Messi', 'Auba', 'Harry']
        },
        series: [
            {
                name: "% Sucesso",
                data: [50.5, 43.2, 59.5, 99.9, 55.5]
            }
        ]
    };

    return (
        <Chart
            options={{ ...optionsvar, xaxis: mockData.labels }} //3pontos faz pegar tudo que tem no objeto, reaproveita ele e acrescenta mais coisas
            series={mockData.series}
            type="bar"
            height="340"
        />
    );
}

export default BarChart;