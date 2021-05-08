package org1.ml;

import weka.classifiers.evaluation.Evaluation;
import weka.classifiers.functions.LinearRegression;
import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;

public class Linear {
	public static void main(String[] args) throws Exception {
		DataSource source =new DataSource("C:\\Users\\Saketh\\eclipse-workspace\\org1.ml\\src\\main\\java\\org1\\ml\\fraud_dataset.csv");
		Instances dataset=source.getDataSet();
		dataset.setClassIndex(dataset.numAttributes()-1);
		
		//linear Regression
				LinearRegression lr=new LinearRegression();
				lr.buildClassifier(dataset);
				
				Evaluation lreval =new Evaluation(dataset);
			    lreval.evaluateModel(lr,dataset);
				System.out.println(lreval.toSummaryString());
				
	}

}
