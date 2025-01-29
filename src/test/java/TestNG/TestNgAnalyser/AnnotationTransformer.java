package TestNG.TestNgAnalyser;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;


public class AnnotationTransformer implements IAnnotationTransformer {

        @Override
        public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod)
        {
            //Modifying the logic for @Test annotation
            //By Default for every test method, we are setting the retryAnalyzer as RetryAnalyser.class
            annotation.setRetryAnalyzer(RetryAnalyser.class);

            //By Default for every test method, we are setting the timeOut as 5000 milliseconds
            //5 secs is the maximum time for the test case to execute
            annotation.setTimeOut(5000);
        }

    }

