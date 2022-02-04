        class Test{
	public static void main(String args[])throws Exception{

        System.out.println("STARTING VI");
        ProcessBuilder processBuilder = new ProcessBuilder("/usr/bin/vim");
        processBuilder.redirectOutput(ProcessBuilder.Redirect.INHERIT);
        processBuilder.redirectError(ProcessBuilder.Redirect.INHERIT);
        processBuilder.redirectInput(ProcessBuilder.Redirect.INHERIT);

        Process p = processBuilder.start();
        // wait for termination.
        p.waitFor();
        System.out.println("Exiting VI");
}
}
