package unidad3;

import java.util.Stack;

class PilaDeshacer {
    Stack<String> pila = new Stack<>();

    public void agregar(String cambio) {
        if (pila.size() == 5) {
            pila.remove(0);
        }
        pila.push(cambio);
    }

    public String deshacer() {
        if (!pila.isEmpty()) {
            return pila.pop();
        }
        return null;
    }
}

