package com.example.demo.service;

import com.example.demo.repositories.DemoRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class DemoServiceTest {


    @Mock
    private DemoRepository demoRepository;

    @InjectMocks
    private DemoService demoService;

    @Test
    void listDemo() {
    }

    @Test
    void findById() {
    }

    @Test
    void saveDemo() {
    }

    @Test
    void deleteDemo() {
    }

    @Nested
    class WhenListingDemo {
        @BeforeEach
        void setup() {
        }
    }

    @Nested
    class WhenFindingById {
        @BeforeEach
        void setup() {
        }
    }

    @Nested
    class WhenSavingDemo {
        @BeforeEach
        void setup() {
        }
    }

    @Nested
    class WhenDeletingDemo {
        @BeforeEach
        void setup() {
        }
    }
}