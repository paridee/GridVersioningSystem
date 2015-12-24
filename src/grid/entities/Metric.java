package grid.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.JoinColumn;
import javax.persistence.Entity;
import javax.persistence.Table;

import grid.interfaces.Updatable;

@Entity
@Table(name="Metric")
public class Metric extends GridElement implements Updatable{
	@Column(name="count")
	public int 					count				=	0;
	@Column(name="description")
	public String				description			=	"";
	public List<String>	measUnits;
	@Column(name="measurementProcess")
	public String				measurementProcess	=	"";
	@Column(name="metricType")
	public String				metricType			=	"";
	@Column(name="scaleType")
	public String				scaleType			=	"";
	
	
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

	@ElementCollection
	@CollectionTable(name="MetricMeasUnits", joinColumns=@JoinColumn(name="metrID"))
	@Column(name="measUnit")
	public List<String> getMeasUnits() {
		return measUnits;
	}


	public void setMeasUnits(List<String> measUnits) {
		this.measUnits = measUnits;
	}


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
	public ArrayList<GridElement> update(GridElement ge) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public GridElement clone() {
		Metric newMetric	=	new Metric();
		newMetric.setLabel(this.getLabel());
		newMetric.setVersion(this.getVersion());
		newMetric.setCount(this.count);
		newMetric.setDescription(this.description);
		List<String> clonedList	=	new ArrayList<String>();
		for(int i=0;i<this.measUnits.size();i++){
			clonedList.add(measUnits.get(i));
		}
		newMetric.setMeasUnits(clonedList);
		newMetric.setMeasurementProcess(this.measurementProcess);
		newMetric.setMetricType(this.metricType);
		newMetric.setScaleType(this.scaleType);
		return newMetric;
	}

}
