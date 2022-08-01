package com.codzure.leonard.androidtesting

import com.google.common.truth.Truth.assertThat
import org.junit.After
import org.junit.Before
import org.junit.Test

class TaxTest {

    // initialize values

    private lateinit var tax: Tax
    @Before
    fun setup(){
        tax = Tax()
    }

    @After
    fun tearDown(){
        //what to run after test
    }

    @Test
    fun calculateTaxTest(){
        val netTax = tax.calculateTax(grossIncome = 100.0, taxRate = 0.1)
        assertThat(netTax).isEqualTo(10) // to pass
    }

    @Test
    fun calculateIncomeTest(){
        val netIncome = tax.calculateIncome(grossIncome = 100.0, taxRate = 0.1)
        assertThat(netIncome).isEqualTo(910) // to fail

    }
}