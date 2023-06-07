package com.example.demo.controller;

import com.example.demo.domain.model.DemoModel;
import com.example.demo.service.DemoService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class DemoControllerTest {


    @Mock
    private DemoService demoService;

    @InjectMocks
    private DemoController demoController;

    @Test
    void createdDemo() {
    }

    @Test
    void getAllDemo() {
    }

    @Test
    void getById() {
    }

    @Test
    void updateDemo() {
    }

    @Test
    void partialUpdateDemo() {
    }

    @Test
    void deleteDemo() {
    }

    @Nested
    class WhenCreatedingDemo {
        @Mock
        private DemoModel demoModel;

        @BeforeEach
        void setup() {
        }
    }

    @Nested
    class WhenGettingAllDemo {
        @BeforeEach
        void setup() {
        }
    }

    @Nested
    class WhenGettingById {
        @BeforeEach
        void setup() {
        }
    }

    @Nested
    class WhenUpdatingDemo {
        @Mock
        private DemoModel demoModel;

        @BeforeEach
        void setup() {
        }
    }

    @Nested
    class WhenPartialingUpdateDemo {
        @Mock
        private DemoModel demoModel;

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