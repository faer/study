package org.farouk.service;

import org.farouk.domain.Fruit;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class FruitServiceTest {

    @Mock
    private FruitService fruitService;

    private Fruit fruit;

    @Before
    public void init() {
        this.fruit = new Fruit("Apple");
    }

    @Test
    public void getName() throws Exception {
        Mockito.when(fruitService.getName(Mockito.any(Fruit.class))).thenReturn("Orange");
        String name = fruitService.getName(this.fruit);
        assertEquals("Orange", name);
    }

}