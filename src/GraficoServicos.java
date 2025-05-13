    import org.jfree.chart.ChartFactory;
    import org.jfree.chart.ChartFrame;
    import org.jfree.chart.JFreeChart;
    import org.jfree.data.category.DefaultCategoryDataset;

public class GraficoServicos {
    public static void exibirGrafico(double s1, double s2, double s3, double s4, double s5) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(s1, "Serviços", "Plantio");
        dataset.addValue(s2, "Serviços", "Poda");
        dataset.addValue(s3, "Serviços", "Controle de Pragas");
        dataset.addValue(s4, "Serviços", "Adubação");
        dataset.addValue(s5, "Serviços", "Irrigação");

        JFreeChart grafico = ChartFactory.createBarChart(
            "Quantidade de Serviços Solicitados", 
            "Tipo de Serviço", 
            "Quantidade", 
            dataset
        );

        ChartFrame frame = new ChartFrame("Gráfico de Serviços", grafico);
        frame.setSize(600, 400);
        frame.setVisible(true);
    }
}


