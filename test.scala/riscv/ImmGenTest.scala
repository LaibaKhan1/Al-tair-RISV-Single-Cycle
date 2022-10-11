package RISCV
import chisel3._
import org.scalatest.FreeSpec
import chiseltest._

class  ImmGenTest extends FreeSpec with ChiselScalatestTester{
    "module7" in {
         test(new ImmGen){ c => 
            c.io.instr.poke("h00830193".U)
            c.io.pc.poke(0.U)
            c.clock.step(10)
            // c.io.I_Type.expect()
            // c.io.S_Type.expect()
            // c.io.SB_Type.expect()
            // c.io.U_Type.expect()
            // c.io.UJ_Type.expect()
        }
    }
}