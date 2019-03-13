package com.springboot.basics.springbootproject;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

@RunWith(MockitoJUnitRunner.class)
public class BooksControllerTest {

    @InjectMocks
    private BooksController booksController;

    private MockMvc mockMvc;

    private long id;
    private String name;
    private String author;


    @Before
    public void setUp() throws Exception {
        mockMvc = standaloneSetup(booksController).build();
    }

    @Test
    public void methodGetAllBooks_returnsStatusOk() throws Exception {


        mockMvc.perform(get("/books"))
                .andExpect(status().isOk());

    }

    @Test
    public void methodGetAllBooks_returnsValidValues() throws NullPointerException {
        List<Book> actual = booksController.getAllBooks();


        assertThat(Arrays.asList(new Book(1L, "Cook Book", "Brook McBook"))).isEqualTo(actual);


    }
}