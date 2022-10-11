package RISCV
import chisel3._
import chisel3.util
import org.scalatest.FreeSpec
import chiseltest._

class DataMemoryTest extends FreeSpec with ChiselScalatestTester{
    "module5" in{
        test (new DataMemory){ c =>
            c.io.Addr.poke(5.U)
            c.io.mem_read.poke(1.B)
            c.io.mem_write.poke(1.B)
            c.io.DataIn.poke(2.S)
            c.clock.step(10)
            c.io.DataOut.expect(2.S)
    }}
}