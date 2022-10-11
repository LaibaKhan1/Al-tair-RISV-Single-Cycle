package RISCV
import chisel3._
import chisel3.util
import org.scalatest.FreeSpec
import chiseltest._

class controlTest extends FreeSpec with ChiselScalatestTester{
    "module1" in{
        test (new Control){ c =>
            c.io.opcode.poke(51.U)
            c.clock.step(10)
            c.io.memwrite.expect(0.U)
            c.io.branch.expect(0.U)
            c.io.memRead.expect(0.U)
            c.io.regWrite.expect(1.U)
            c.io.memtoReg.expect(0.U)
            c.io.aLUoperation.expect(0.U)
            c.io.operand_A_sel.expect(0.U)
            c.io.operand_B_sel.expect(0.U)
            c.io.extend_sel.expect(0.U)
            c.io.next_pc_sel.expect(0.U)
        }
    }
}