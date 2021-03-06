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
	
	/**
	 * Getter for the metric count
	 * @return count of this metric
	 */
	public int getCount() {
		return count;
	}

	/**
	 * Setter for the metric count
	 * @param count count to be set for this metric
	 */
	public void setCount(int count) {
		this.count = count;
	}

	/**
	 * Getter of metric description
	 * @return description of this metric
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Setter for metric description
	 * @param description description for this metric
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Getter method for measurement units of this metric
	 * @return list of measurement units
	 */
	@ElementCollection
	@CollectionTable(	name		=	"MetricMeasUnits", 
						joinColumns	=	@JoinColumn(name="metrID"))
	@Column(name="measUnit")
	public List<String> getMeasUnits() {
		return measUnits;
	}

	/**
	 * Setter method for measurement units of this metric
	 * @param measUnits new measurements units to be set
	 */
	public void setMeasUnits(List<String> measUnits) {
		this.measUnits = measUnits;
	}

	/**
	 * Getter method for measurement process
	 * @return measurement process for this metric
	 */
	public String getMeasurementProcess() {
		return measurementProcess;
	}

	/**
	 * Setter of measurement process for this metric
	 * @param measurementProcess measurement process to be set
	 */
	public void setMeasurementProcess(String measurementProcess) {
		this.measurementProcess = measurementProcess;
	}

	/**
	 * Gets the metric type for this metric
	 * @return metric type
	 */
	public String getMetricType() {
		return metricType;
	}

	/**
	 * Setter for metric type
	 * @param metricType metric type to be set for this metric
	 */
	public void setMetricType(String metricType) {
		this.metricType = metricType;
	}

	/**
	 * Getter method for scale type of this object
	 * @return scale type
	 */
	public String getScaleType() {
		return scaleType;
	}

	/**
	 * Setter method for scale type of this metric
	 * @param scaleType new scale type to be set
	 */
	public void setScaleType(String scaleType) {
		this.scaleType = scaleType;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ArrayList<GridElement> update(GridElement ge) {
		return new ArrayList<GridElement>();
	}

	/**
	 * {@inheritDoc}
	 */
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
