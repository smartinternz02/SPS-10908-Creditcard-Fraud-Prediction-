package org1.ml;

import java.io.IOException;

import tech.tablesaw.api.Table;
import tech.tablesaw.plotly.Plot;
import tech.tablesaw.plotly.components.Figure;
import tech.tablesaw.plotly.components.Layout;
import tech.tablesaw.plotly.traces.BoxTrace;
import tech.tablesaw.plotly.traces.HistogramTrace;

public class Analysis {
	public static void main(String args[]) {
		System.out.println("Creditcard data Analysis");
		try {
			Table Creditcard_data = Table.read().csv("C:\\Users\\Saketh\\eclipse-workspace\\org1.ml\\src\\main\\java\\org1\\ml\\fraud_dataset.csv");
			System.out.println(Creditcard_data.shape());
			
			 System.out.println(Creditcard_data.structure());
		     
			 System.out.println(Creditcard_data.summary());
			
			    ////   Histogram
			    Layout layout1=Layout.builder().title("Distribution of Loan_Term").build();
			    HistogramTrace trace1= HistogramTrace.builder(Creditcard_data.nCol("Loan_Term")).build();
			    Plot.show(new Figure(layout1, trace1));
			    
			     Layout layout3 = Layout.builder().title("fraud risk by ApplicantIncome").build();
			     BoxTrace trace3 =BoxTrace.builder(Creditcard_data.categoricalColumn("Fraud_Risk"), Creditcard_data.nCol("ApplicantIncome")).build();
			     Plot.show(new Figure(layout3, trace3));
			    
			} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

   }
}
