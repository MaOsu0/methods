public class ComputerFactory {

    Computer create (String processorNazwa, int memoryNazwa) {
        Computer computer = new Computer();
        computer.procesor = processorNazwa;
        computer.memory = memoryNazwa;

        return computer ;
    }
}
