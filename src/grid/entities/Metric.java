package grid.entities;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import grid.interfaces.Updatable;

@Entity
@Table(name="Metric")
public class Metric extends GridEntity implements Updatable{
	@Column(name="count")
	public int 					count;
	@Column(name="description")
	public String				description;
	//public ArrayList<String>	measUnits;
	@Column(name="measurementProcess")
	public String				measurementProcess;
	@Column(name="metricType")
	public String				metricType;
	@Column(name="scaleType")
	public String				scaleType;
	
	
	public int getCount() {
		return count;
	}


	public void setCount(int count) {
		this.count = count;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}

/*
	public ArrayList<String> getMeasUnits() {
		return measUnits;
	}


	public void setMeasUnits(ArrayList<String> measUnits) {
		this.measUnits = measUnits;
	}*/


	public String getMeasurementProcess() {
		return measurementProcess;
	}


	public void setMeasurementProcess(String measurementProcess) {
		this.measurementProcess = measurementProcess;
	}


	public String getMetricType() {
		return metricType;
	}


	public void setMetricType(String metricType) {
		this.metricType = metricType;
	}


	public String getScaleType() {
		return scaleType;
	}


	public void setScaleType(String scaleType) {
		this.scaleType = scaleType;
	}


	@Override
	public ArrayList<GridEntity> update(GridEntity ge) {
		// TODO Auto-generated method stub
		return null;
	}

}
