package tests;

import control.CalculadoraIMC;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TesteCalculadoraIMC {

    CalculadoraIMC calc;

    @Before
    public void setup() {
        calc = new CalculadoraIMC();
    }

    @After
    public void tearDown() {
        calc = null;
    }

// menino 2 anos

    @Test
    public void meninoDoisAnosBaixoPeso() {
        Assert.assertEquals("Baixo peso", calc.calcularImc(0.80, 9.0, 2,"masculino"));
    }

    @Test
    public void meninoDoisAnosPesoNormalLimiteInferior() {
        Assert.assertEquals("Peso normal", calc.calcularImc(0.82, 10.0, 2,"masculino"));
    }

    @Test
    public void meninoDoisAnosPesoNormalLimiteSuperior() {
        Assert.assertEquals("Peso normal", calc.calcularImc(1.05, 19.0, 2,"masculino"));
    }


    @Test
    public void meninoDoisAnosSobrepesoLimiteInferior() {
        Assert.assertEquals("Sobrepeso", calc.calcularImc(0.87, 14.0, 2,"masculino"));
    }

    @Test
    public void meninoDoisAnosSobrepesoLimiteSuperior() {
        Assert.assertEquals("Sobrepeso", calc.calcularImc(1.15, 25.0, 2,"masculino"));
    }

    @Test
    public void meninoDoisAnosObesidade() {
        Assert.assertEquals("Obesidade", calc.calcularImc(0.85, 14.0, 2,"masculino"));
    }


// menino 4 anos

    @Test
    public void meninoQuatroAnosBaixoPeso() {
        Assert.assertEquals("Baixo peso", calc.calcularImc(0.98, 13.0, 4,"masculino"));
    }

    @Test
    public void meninoQuatroAnosPesoNormalLimiteInferior() {
        Assert.assertEquals("Peso normal", calc.calcularImc(0.96, 13.0, 4,"masculino"));
    }

    @Test
    public void meninoQuatroAnosPesoNormalLimiteSuperior() {
        Assert.assertEquals("Peso normal", calc.calcularImc(1.23, 25.0, 4,"masculino"));
    }

    @Test
    public void meninoQuatroAnosSobrepesoLimiteInferior() {
        Assert.assertEquals("Sobrepeso", calc.calcularImc(1.01, 18.0, 4,"masculino"));
    }

    @Test
    public void meninoQuatroAnosSobrepesoLimiteSuperior() {
        Assert.assertEquals("Sobrepeso", calc.calcularImc(1.27, 28.0, 4,"masculino"));
    }

    @Test
    public void meninoQuatroAnosObesidade() {
        Assert.assertEquals("Obesidade", calc.calcularImc(1.03, 19.0, 4,"masculino"));
    }


// menino 6 anos

    @Test
    public void meninoSeisAnosBaixoPeso() {
        Assert.assertEquals("Baixo peso", calc.calcularImc(1.08, 16.0, 6,"masculino"));
    }

    @Test
    public void meninoSeisAnosPesoNormalLimiteInferior() {
        Assert.assertEquals("Peso normal", calc.calcularImc(1.13, 18.0, 6,"masculino"));
    }

    @Test
    public void meninoSeisAnosPesoNormalLimiteSuperior() {
        Assert.assertEquals("Peso normal", calc.calcularImc(1.31, 29.0, 6,"masculino"));
    }

    @Test
    public void meninoSeisAnosSobrepesoLimiteInferior() {
        Assert.assertEquals("Sobrepeso", calc.calcularImc(1.10, 21.0, 6,"masculino"));
    }

    @Test
    public void meninoSeisAnosSobrepesoLimiteSuperior() {
        Assert.assertEquals("Sobrepeso", calc.calcularImc(1.33, 32.0, 6,"masculino"));
    }

    @Test
    public void meninoSeisAnosObesidade() {
        Assert.assertEquals("Obesidade", calc.calcularImc(1.12, 23.0, 6,"masculino"));
    }

// menino 8 anos

    @Test
    public void meninoOitoAnosBaixoPeso() {
        Assert.assertEquals("Baixo peso", calc.calcularImc(1.20, 19.0, 8,"masculino"));
    }

    @Test
    public void meninoOitoAnosPesoNormalLimiteInferior() {
        Assert.assertEquals("Peso normal", calc.calcularImc(1.24, 22.0, 8,"masculino"));
    }

    @Test
    public void meninoOitoAnosPesoNormalLimiteSuperior() {
        Assert.assertEquals("Peso normal", calc.calcularImc(1.35, 32.0, 8,"masculino"));
    }

    @Test
    public void meninoOitoAnosSobrepesoLimiteInferior() {
        Assert.assertEquals("Sobrepeso", calc.calcularImc(1.20, 26.0, 8,"masculino"));
    }

    @Test
    public void meninoOitoAnosSobrepesoLimiteSuperior() {
        Assert.assertEquals("Sobrepeso", calc.calcularImc(1.34, 35.0, 8,"masculino"));
    }

    @Test
    public void meninoOitoAnosObesidade() {
        Assert.assertEquals("Obesidade", calc.calcularImc(1.27, 33.0, 8,"masculino"));
    }

// menino 10 anos

    @Test
    public void meninoDezAnosBaixoPeso() {
        Assert.assertEquals("Baixo peso", calc.calcularImc(1.33, 25.0, 10,"masculino"));
    }

    @Test
    public void meninoDezAnosPesoNormalLimiteInferior() {
        Assert.assertEquals("Peso normal", calc.calcularImc(1.30, 25.0, 10,"masculino"));
    }

    @Test
    public void meninoDezAnosPesoNormalLimiteSuperior() {
        Assert.assertEquals("Peso normal", calc.calcularImc(1.38, 36.0, 10,"masculino"));
    }

    @Test
    public void meninoDezAnosSobrepesoLimiteInferior() {
        Assert.assertEquals("Sobrepeso", calc.calcularImc(1.38, 37.0, 10,"masculino"));
    }

    @Test
    public void meninoDezAnosSobrepesoLimiteSuperior() {
        Assert.assertEquals("Sobrepeso", calc.calcularImc(1.38, 41.0, 10,"masculino"));
    }

    @Test
    public void meninoDezAnosObesidade() {
        Assert.assertEquals("Obesidade", calc.calcularImc(1.40, 44.0, 10,"masculino"));
    }


// menina 2 anos

    @Test
    public void meninaDoisAnosBaixoPeso() {
        Assert.assertEquals("Baixo peso", calc.calcularImc(0.81, 9.0, 2,"feminino"));
    }

    @Test
    public void meninaDoisAnosPesoNormalLimiteInferior() {
        Assert.assertEquals("Peso normal", calc.calcularImc(0.82, 10.0, 2,"feminino"));
    }

    @Test
    public void meninaDoisAnosPesoNormalLimiteSuperior() {
        Assert.assertEquals("Peso normal", calc.calcularImc(0.85, 13.0, 2,"feminino"));
    }

    @Test
    public void meninaDoisAnosSobrepesoLimiteInferior() {
        Assert.assertEquals("Sobrepeso", calc.calcularImc(0.87, 14.0, 2,"feminino"));
    }

    @Test
    public void meninaDoisAnosSobrepesoLimiteSuperior() {
        Assert.assertEquals("Sobrepeso", calc.calcularImc(0.86, 14.0, 2,"feminino"));
    }

    @Test
    public void meninaDoisAnosObesidade() {
        Assert.assertEquals("Obesidade", calc.calcularImc(0.85, 14.0, 2,"feminino"));
    }


// menina 4 anos

    @Test
    public void meninaQuatroAnosBaixoPeso() {
        Assert.assertEquals("Baixo peso", calc.calcularImc(0.98, 13.0, 4,"feminino"));
    }

    @Test
    public void meninaQuatroAnosPesoNormalLimiteInferior() {
        Assert.assertEquals("Peso normal", calc.calcularImc(0.96, 13.0, 4,"feminino"));
    }

    @Test
    public void meninaQuatroAnosPesoNormalLimiteSuperior() {
        Assert.assertEquals("Peso normal", calc.calcularImc(1.23, 25.0, 4,"feminino"));
    }

    @Test
    public void meninaQuatroAnosSobrepesoLimiteInferior() {
        Assert.assertEquals("Sobrepeso", calc.calcularImc(1.02, 18.0, 4,"feminino"));
    }

    @Test
    public void meninaQuatroAnosSobrepesoLimiteSuperior() {
        Assert.assertEquals("Sobrepeso", calc.calcularImc(1.27, 28.0, 4,"feminino"));
    }

    @Test
    public void meninaQuatroAnosObesidade() {
        Assert.assertEquals("Obesidade", calc.calcularImc(1.03, 20.0, 4,"feminino"));
    }


// menina 6 anos

    @Test
    public void meninaSeisAnosBaixoPeso() {
        Assert.assertEquals("Baixo peso", calc.calcularImc(1.07, 15.0, 6,"feminino"));
    }

    @Test
    public void meninaSeisAnosPesoNormalLimiteInferior() {
        Assert.assertEquals("Peso normal", calc.calcularImc(1.09, 16.0, 6,"feminino"));
    }

    @Test
    public void meninaSeisAnosPesoNormalLimiteSuperior() {
        Assert.assertEquals("Peso normal", calc.calcularImc(1.31, 29.0, 6,"feminino"));
    }

    @Test
    public void meninaSeisAnosSobrepesoLimiteInferior() {
        Assert.assertEquals("Sobrepeso", calc.calcularImc(1.10, 21.0, 6,"feminino"));
    }

    @Test
    public void meninaSeisAnosSobrepesoLimiteSuperior() {
        Assert.assertEquals("Sobrepeso", calc.calcularImc(1.33, 32.0, 6,"feminino"));
    }

    @Test
    public void meninaSeisAnosObesidade() {
        Assert.assertEquals("Obesidade", calc.calcularImc(1.12, 24.0, 6,"feminino"));
    }

// menina 8 anos

    @Test
    public void meninaOitoAnosBaixoPeso() {
        Assert.assertEquals("Baixo peso", calc.calcularImc(1.20, 19.0, 8,"feminino"));
    }

    @Test
    public void meninaOitoAnosPesoNormalLimiteInferior() {
        Assert.assertEquals("Peso normal", calc.calcularImc(1.25, 22.0, 8,"feminino"));
    }

    @Test
    public void meninaOitoAnosPesoNormalLimiteSuperior() {
        Assert.assertEquals("Peso normal", calc.calcularImc(1.35, 32.0, 8,"feminino"));
    }

    @Test
    public void meninaOitoAnosSobrepesoLimiteInferior() {
        Assert.assertEquals("Sobrepeso", calc.calcularImc(1.20, 27.0, 8,"feminino"));
    }

    @Test
    public void meninaOitoAnosSobrepesoLimiteSuperior() {
        Assert.assertEquals("Sobrepeso", calc.calcularImc(1.34, 35.0, 8,"feminino"));
    }

    @Test
    public void meninaOitoAnosObesidade() {
        Assert.assertEquals("Obesidade", calc.calcularImc(1.26, 33.0, 8,"feminino"));
    }

// menina 10 anos

    @Test
    public void meninaDezAnosBaixoPeso() {
        Assert.assertEquals("Baixo peso", calc.calcularImc(1.32, 24.0, 10,"feminino"));
    }

    @Test
    public void meninaDezAnosPesoNormalInferior() {
        Assert.assertEquals("Peso normal", calc.calcularImc(1.30, 25.0, 10,"feminino"));
    }

    @Test
    public void meninaDezAnosPesoNormalLimiteSuperior() {
        Assert.assertEquals("Peso normal", calc.calcularImc(1.38, 35.0, 10,"feminino"));
    }

    @Test
    public void meninaDezAnosSobrepesoLimiteInferior() {
        Assert.assertEquals("Sobrepeso", calc.calcularImc(1.38, 39.0, 10,"feminino"));
    }

    @Test
    public void meninaDezAnosSobrepesoLimiteSuperior() {
        Assert.assertEquals("Sobrepeso", calc.calcularImc(1.38, 41.0, 10,"feminino"));
    }

    @Test
    public void meninaDezAnosObesidade() {
        Assert.assertEquals("Obesidade", calc.calcularImc(1.40, 46.0, 10,"feminino"));
    }

// adulto

    @Test
    public void adultoBaixoPesoMuitoGrave() {
        Assert.assertEquals("Baixo peso muito grave", calc.calcularImc(1.66, 44.0, 21,"masculino"));
    }

    @Test
    public void adultoBaixoPesoGrave1() {
        Assert.assertEquals("Baixo peso grave", calc.calcularImc(1.65, 44.0, 25,"feminino"));
    }

    @Test
    public void adultoBaixoPesoGrave2() {
        Assert.assertEquals("Baixo peso grave", calc.calcularImc(1.65, 46.0, 38,"feminino"));
    }

    @Test
    public void adultoBaixoPeso1() {
        Assert.assertEquals("Baixo peso", calc.calcularImc(1.76, 53.0, 54,"masculino"));
    }

    @Test
    public void adultoBaixoPeso2() {
        Assert.assertEquals("Baixo peso", calc.calcularImc(1.76, 57.0, 30,"masculino"));
    }

    @Test
    public void adultoPesoNormal1() {
        Assert.assertEquals("Peso normal", calc.calcularImc(1.63, 50.0, 22,"feminino"));
    }

    @Test
    public void adultoPesoNormal2() {
        Assert.assertEquals("Peso normal", calc.calcularImc(1.71, 73.0, 44,"masculino"));
    }

    @Test
    public void adultoSobrepeso1() {
        Assert.assertEquals("Sobrepeso", calc.calcularImc(1.69, 72.0, 39,"feminino"));
    }

    @Test
    public void adultoSobrepeso2() {
        Assert.assertEquals("Sobrepeso", calc.calcularImc(1.80, 97.0, 33,"masculino"));
    }

    @Test
    public void adultoObesidadeI1() {
        Assert.assertEquals("Obesidade grau I", calc.calcularImc(1.79, 97.0, 55,"masculino"));
    }

    @Test
    public void adultoObesidadeI2() {
        Assert.assertEquals("Obesidade grau I", calc.calcularImc(1.81, 114.0, 26,"feminino"));
    }

    @Test
    public void adultoObesidadeII1() {
        Assert.assertEquals("Obesidade grau II", calc.calcularImc(1.77, 110.0, 20,"feminino"));
    }

    @Test
    public void adultoObesidadeII2() {
        Assert.assertEquals("Obesidade grau II", calc.calcularImc(1.89, 142.0, 31,"masculino"));
    }

    @Test
    public void adultoObesidadeIII() {
        Assert.assertEquals("Obesidade grau III (obesidade mórbida)", calc.calcularImc(1.91, 146.0, 56,"feminino"));
    }

// idoso

    @Test
    public void idosoBaixoPeso() {
        Assert.assertEquals("Baixo peso", calc.calcularImc(1.73, 65.0, 66,"masculino"));
    }

    @Test
    public void idosoPesoNormal1() {
        Assert.assertEquals("Peso normal", calc.calcularImc(1.69, 63.0, 67,"masculino"));
    }

    @Test
    public void idosoPesoNormal2() {
        Assert.assertEquals("Peso normal", calc.calcularImc(1.68, 76.0, 70,"masculino"));
    }

    @Test
    public void idosoSobrepeso1() {
        Assert.assertEquals("Sobrepeso", calc.calcularImc(1.68, 77.0, 81,"masculino"));
    }

    @Test
    public void idosoSobrepeso2() {
        Assert.assertEquals("Sobrepeso", calc.calcularImc(1.70, 86.0, 63,"masculino"));
    }

    @Test
    public void idosoObesidadeI1() {
        Assert.assertEquals("Obesidade grau I", calc.calcularImc(1.70, 88.0, 68,"masculino"));
    }

    @Test
    public void idosoObesidadeI2() {
        Assert.assertEquals("Obesidade grau I", calc.calcularImc(1.61, 90.0, 70,"masculino"));
    }

    @Test
    public void idosoObesidadeII1() {
        Assert.assertEquals("Obesidade grau II", calc.calcularImc(1.72, 104.0, 65,"masculino"));
    }

    @Test
    public void idosoObesidadeII2() {
        Assert.assertEquals("Obesidade grau II", calc.calcularImc(1.72, 115.0, 69,"masculino"));
    }

    @Test
    public void idosoObesidadeIII() {
        Assert.assertEquals("Obesidade grau III (obesidade mórbida)", calc.calcularImc(1.71, 117.0, 68,"masculino"));
    }

// idosa

    @Test
    public void idosaBaixoPeso() {
        Assert.assertEquals("Baixo peso", calc.calcularImc(1.67, 61.0, 69,"feminino"));
    }

    @Test
    public void idosaPesoNormal1() {
        Assert.assertEquals("Peso normal", calc.calcularImc(1.70, 64.0, 80,"feminino"));
    }

    @Test
    public void idosaPesoNormal2() {
        Assert.assertEquals("Peso normal", calc.calcularImc(1.60, 69.0, 74,"feminino"));
    }

    @Test
    public void idosaSobrepeso1() {
        Assert.assertEquals("Sobrepeso", calc.calcularImc(1.62, 71.0, 70,"feminino"));
    }

    @Test
    public void idosaSobrepeso2() {
        Assert.assertEquals("Sobrepeso", calc.calcularImc(1.65, 87.0, 91,"feminino"));
    }

    @Test
    public void idosaObesidadeI1() {
        Assert.assertEquals("Obesidade grau I", calc.calcularImc(1.59, 81.0, 88,"feminino"));
    }

    @Test
    public void idosaObesidadeI2() {
        Assert.assertEquals("Obesidade grau I", calc.calcularImc(1.62, 97.0, 70,"feminino"));
    }

    @Test
    public void idosaObesidadeII1() {
        Assert.assertEquals("Obesidade grau II", calc.calcularImc(1.60, 95.0, 77,"feminino"));
    }

    @Test
    public void idosaObesidadeII2() {
        Assert.assertEquals("Obesidade grau II", calc.calcularImc(1.60, 107.0, 65,"feminino"));
    }

    @Test
    public void idosaObesidadeIII() {
        Assert.assertEquals("Obesidade grau III (obesidade mórbida)", calc.calcularImc(1.57, 104.0, 88,"feminino"));
    }
}