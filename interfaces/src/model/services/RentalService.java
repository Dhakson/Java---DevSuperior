package model.services;

import java.time.Duration;

import model.entities.CarRental;
import model.entities.Invoice;

public class RentalService{
	private Double pricePerHour;
	private Double pricePerDay;
	
	private TaxService taxService;

	public RentalService(Double pricePerHour, Double pricePerDay, TaxService taxService) {
		
		this.pricePerHour = pricePerHour;
		this.pricePerDay = pricePerDay;
		this.taxService = taxService;
	}

	public Double getPricePerHour() {
		return pricePerHour;
	}

	public void setPricePerHour(Double pricePerHour) {
		this.pricePerHour = pricePerHour;
	}

	public Double getPricePerDay() {
		return pricePerDay;
	}

	public void setPricePerDay(Double pricePerDay) {
		this.pricePerDay = pricePerDay;
	}

	public TaxService getTaxService() {
		return taxService;
	}

	public void setTaxService(BrazilTaxService taxService) {
		this.taxService = taxService;
	}
	
	public void processInvoice(CarRental carRental) {
		double  minutes = Duration.between(carRental.getStar(), carRental.getFinish()).toMinutes();
		double hours = minutes / 60.0;
		
		double basicPayament;
		
		if(hours <= 12) {
			basicPayament = pricePerHour * Math.ceil(hours);
		}
		else {
			basicPayament = pricePerDay * Math.ceil(hours/24);
		}
		
		double tax = taxService.tax(basicPayament);
		
		carRental.setInvoice(new Invoice(basicPayament,tax));
	}
	
	
	
}