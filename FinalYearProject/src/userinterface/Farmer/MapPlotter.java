package userinterface.Farmer;

import Business.Network.Hospital;
import Business.Network.Network;
import java.awt.Polygon;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.io.Serializable;
import javax.swing.JPanel;
import org.jfree.chart.*;
import org.jfree.chart.labels.StandardXYItemLabelGenerator;
import org.jfree.chart.labels.XYItemLabelGenerator;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;
import org.jfree.util.PublicCloneable;

public class MapPlotter extends ApplicationFrame {
    Network network;
    int x;
    int y;
    Hospital nearestHospital;
    JPanel panel;

    public MapPlotter(String s, Network network, int x, int y, Hospital nearestHospital) {
        super(s);
        this.network = network;
        this.x = x;
        this.y = y;
        this.nearestHospital = nearestHospital;
        panel = createDemoPanel();
//        JPanel jpanel = createDemoPanel();
//        jpanel.setPreferredSize(new Dimension(500, 270));
//        setContentPane(jpanel);
        

    }

    public JPanel createDemoPanel() {

        JFreeChart jfreechart = ChartFactory.createScatterPlot("Map View For Farmer",
            "Longitude", "Latitude", samplexydataset2(), PlotOrientation.VERTICAL, true, true, false);
        
        Shape cross = new Ellipse2D.Double(3,4,20,20);
//        Shape dancingStar = ShapeUtils.radiusShape(15, 20, 6, 12);
        

        Polygon triangle = new Polygon();
        triangle.addPoint(0, 0);
        triangle.addPoint(5, 10);
        triangle.addPoint(10, 0);
        

        XYPlot xyPlot = (XYPlot) jfreechart.getPlot();
        XYItemRenderer renderer = xyPlot.getRenderer();
        
//        renderer.setSeriesShape(0, cross);
//        renderer.setSeriesShape(1, triangle);

        xyPlot.setDomainCrosshairVisible(true);
        xyPlot.setRangeCrosshairVisible(true);
        
        renderer.setBaseItemLabelGenerator(new LegendXYItemLabelGenerator(xyPlot.getLegendItems()));
        renderer.setBaseItemLabelsVisible(true);
        
        XYLineAndShapeRenderer rendererLine = new XYLineAndShapeRenderer();
        rendererLine.setSeriesLinesVisible(2, true);
        rendererLine.setSeriesLinesVisible(0, false);
        rendererLine.setSeriesLinesVisible(1, false);
        rendererLine.setSeriesShapesVisible(0, true);
        rendererLine.setSeriesShapesVisible(1, true);
        rendererLine.setSeriesShapesVisible(2, false);
        
        System.exit(1);
        
        xyPlot.setRenderer(rendererLine);
        

        return new ChartPanel(jfreechart);
    }

    private XYDataset samplexydataset2() {
        int cols = 10;
        int rows = 10;
        double[][] values = new double[cols][rows];

        XYSeriesCollection xySeriesCollection = new XYSeriesCollection();
        XYSeries hospitalSeries = new XYSeries("Hospital");
        XYSeries farmerLocation = new XYSeries("Farmer Location");
        XYSeries neartestFarmerHospital = new XYSeries("Farmer - Nearest Hospital");
        
        farmerLocation.add(x,y);
        
        for(Hospital hospital: network.getHospitalDirectory().getHospitalDirectory()){
            int x = hospital.getLongitude();
            int y = hospital.getLatitude();
            hospitalSeries.add(x,y);            
        }
        
        neartestFarmerHospital.add(x,y);
        neartestFarmerHospital.add(nearestHospital.getLongitude(),nearestHospital.getLatitude());
        
        
        xySeriesCollection.addSeries(hospitalSeries);
        xySeriesCollection.addSeries(farmerLocation);
        xySeriesCollection.addSeries(neartestFarmerHospital);
        return xySeriesCollection;
    }

    public static void main(String args[]) {
        Network network = new Network();
        populateTable(network);
        
        MapPlotter scatterplotdemo4 = new MapPlotter("Map View for Farmer & Hospital",network, 25,25, null);
        scatterplotdemo4.pack();
        RefineryUtilities.centerFrameOnScreen(scatterplotdemo4);
        scatterplotdemo4.setVisible(true);
    }
    
    private static void populateTable(Network network) {
        Hospital hospital = network.getHospitalDirectory().createAndAddHospital();
        hospital.setName("GeneralMass");
        hospital.setAddress("Boston MA");
        hospital.setAdministrationNumber("666-699-9666");
        hospital.setHotlineNumber(911);
        hospital.setLongitude(50);
        hospital.setLatitude(50);
        
        Hospital hospital1 = network.getHospitalDirectory().createAndAddHospital();
        hospital1.setName("Franklin Hospital");
        hospital1.setAddress("Boston MA");
        hospital1.setAdministrationNumber("999-111-1111");
        hospital1.setHotlineNumber(811);
        hospital1.setLongitude(25);
        hospital1.setLatitude(25);
        
        Hospital hospital3 = network.getHospitalDirectory().createAndAddHospital();
        hospital3.setName("Big Free Hospital");
        hospital3.setAddress("Providence MA");
        hospital3.setAdministrationNumber("999-000-0000");
        hospital3.setHotlineNumber(411);
        hospital3.setLongitude(99);
        hospital3.setLatitude(99);
        
        Hospital hospital4 = network.getHospitalDirectory().createAndAddHospital();
        hospital4.setName("Northeastern Hospital");
        hospital4.setAddress("Boston MA");
        hospital4.setAdministrationNumber("655-555-5555");
        hospital4.setHotlineNumber(111);
        hospital4.setLongitude(82);
        hospital4.setLatitude(25);
    }
    
    
    public class LegendXYItemLabelGenerator extends StandardXYItemLabelGenerator
        implements XYItemLabelGenerator, Cloneable, PublicCloneable,
        Serializable {
    private LegendItemCollection legendItems;

    public LegendXYItemLabelGenerator(LegendItemCollection legendItems) {
        super();
        this.legendItems = legendItems;
    }

    @Override
    public String generateLabel(XYDataset dataset, int series, int item) {
        LegendItem legendItem = legendItems.get(series);
        
        return legendItem.getLabel();
    }
}

    public JPanel getPanel() {
        return panel;
    }
    
    


}