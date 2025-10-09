package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.ReceiptRefund: ImageVector
    get() {
        if (_ReceiptRefund != null) {
            return _ReceiptRefund!!
        }
        _ReceiptRefund = ImageVector.Builder(
            name = "Outlined.ReceiptRefund",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.25f, 9.75f)
                horizontalLineToRelative(4.875f)
                arcToRelative(2.625f, 2.625f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 5.25f)
                horizontalLineTo(12f)
                moveTo(8.25f, 9.75f)
                lineTo(10.5f, 7.5f)
                moveTo(8.25f, 9.75f)
                lineTo(10.5f, 12f)
                moveToRelative(9f, -7.243f)
                verticalLineTo(21.75f)
                lineToRelative(-3.75f, -1.5f)
                lineToRelative(-3.75f, 1.5f)
                lineToRelative(-3.75f, -1.5f)
                lineToRelative(-3.75f, 1.5f)
                verticalLineTo(4.757f)
                curveToRelative(0f, -1.108f, 0.806f, -2.057f, 1.907f, -2.185f)
                arcToRelative(48.507f, 48.507f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.186f, 0f)
                curveToRelative(1.1f, 0.128f, 1.907f, 1.077f, 1.907f, 2.185f)
                close()
            }
        }.build()

        return _ReceiptRefund!!
    }

@Suppress("ObjectPropertyName")
private var _ReceiptRefund: ImageVector? = null
