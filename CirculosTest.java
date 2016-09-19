package unlam.programaciobasica2.trabajopractico1;

import org.junit.Assert;
import org.junit.Test;

import unlam.programacionbasica2.trabajopractico1.Circulos;

public class CirculosTest {

	@Test
	//Circulo con radio 2
	public void PruebaDeCreacionDeCirculoConRadio2 ()
	{
		Circulos circ2 = new Circulos();
		
		Double ValorEsperado=12.56;
		Double ValorActual;
		circ2.setRadio(2.00);
		circ2.CalcularPerimetro();
		ValorActual=circ2.VerPerimetro();
		
		Assert.assertEquals(ValorEsperado.doubleValue(),ValorActual.doubleValue(), 2);
	}
	@Test
	//Circulo con radio 3.7
	public void PruebaDeCreacionDeCirculoConRadio3 ()
	{
		Circulos circ3 = new Circulos();
		
		Double ValorEsperado=23.23;
		Double ValorActual;
		circ3.setRadio(3.70);
		circ3.CalcularPerimetro();
		ValorActual=circ3.VerPerimetro();
		
		Assert.assertEquals(ValorEsperado.doubleValue(),ValorActual.doubleValue(), 2);
	}
	@Test
	//Circulo con radio 5
	public void PruebaDeCreacionDeCirculoConRadio5 ()
	{
		Circulos circ5 = new Circulos();
		
		Double ValorEsperado=31.40;
		Double ValorActual;
		circ5.setRadio(5.00);
		circ5.CalcularPerimetro();
		ValorActual=circ5.VerPerimetro();
		
		Assert.assertEquals(ValorEsperado.doubleValue(),ValorActual.doubleValue(), 2);
	}
	@Test
	//Circulo con radio 10.90
	public void PruebaDeCreacionDeCirculoConRadio10 ()
	{
		Circulos circ10 = new Circulos();
		
		Double ValorEsperado=68.45;
		Double ValorActual;
		circ10.setRadio(10.90);
		circ10.CalcularPerimetro();
		ValorActual=circ10.VerPerimetro();
		
		Assert.assertEquals(ValorEsperado.doubleValue(),ValorActual.doubleValue(), 2);
	}
	//Circulo con radio 9.8
	@Test
	public void PruebaDeCreacionDeCirculoConRadio9 ()
	{
		Circulos circ9 = new Circulos();
		
		Double ValorEsperado=615.73;
		Double ValorActual;
		circ9.setRadio(9.80);
		circ9.CalcularSuperficie();
		ValorActual=circ9.VerSuperficie();
		
		Assert.assertEquals(ValorEsperado.doubleValue(), ValorActual.doubleValue(), 2);
	}
	//Circulo con radio 16.6
	@Test
	public void PruebaDeCreacionDeCirculoConRadio16 ()
	{
		Circulos circ16 = new Circulos();
		
		Double ValorEsperado=865.67;
		Double ValorActual;
		circ16.setRadio(16.60);
		circ16.CalcularPerimetro();
		circ16.CalcularSuperficie();
		ValorActual=circ16.VerSuperficie();
		
		Assert.assertEquals(ValorEsperado.doubleValue(),ValorActual.doubleValue(), 2);
	}
}
