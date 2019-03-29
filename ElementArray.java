package com.company;

public class ElementArray {
    public static void main(String[] args) {
        MetalElement metalElement = new MetalElement("Ti", 22, 47.867);
        MetalElement metalElement1 = new MetalElement("Au", 79, 196.96);
        NonMetalElement nonMetalElement = new NonMetalElement("O", 8, 15.999);
        NonMetalElement nonMetalElement1 = new NonMetalElement("Ne", 10, 20.1797);
        Element[] elements = {metalElement, metalElement1, nonMetalElement, nonMetalElement1};
        for (Element element : elements) {
            element.describeElement();
        }
    }
}
