package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.ReceiptPercent: ImageVector
    get() {
        if (_ReceiptPercent != null) {
            return _ReceiptPercent!!
        }
        _ReceiptPercent = ImageVector.Builder(
            name = "Outlined.ReceiptPercent",
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
                moveToRelative(9f, 14.25f)
                lineToRelative(6f, -6f)
                moveToRelative(4.5f, -3.493f)
                lineTo(19.5f, 21.75f)
                lineToRelative(-3.75f, -1.5f)
                lineToRelative(-3.75f, 1.5f)
                lineToRelative(-3.75f, -1.5f)
                lineToRelative(-3.75f, 1.5f)
                lineTo(4.5f, 4.757f)
                curveToRelative(0f, -1.108f, 0.806f, -2.057f, 1.907f, -2.185f)
                arcToRelative(48.507f, 48.507f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.186f, 0f)
                curveToRelative(1.1f, 0.128f, 1.907f, 1.077f, 1.907f, 2.185f)
                close()
                moveTo(9.75f, 9f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(0.008f)
                lineTo(9.75f, 9.008f)
                lineTo(9.75f, 9f)
                close()
                moveTo(10.125f, 9f)
                arcToRelative(0.375f, 0.375f, 0f, isMoreThanHalf = true, isPositiveArc = true, -0.75f, 0f)
                arcToRelative(0.375f, 0.375f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, 0f)
                close()
                moveTo(14.25f, 13.5f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(0.008f)
                horizontalLineToRelative(-0.008f)
                lineTo(14.25f, 13.5f)
                close()
                moveTo(14.625f, 13.5f)
                arcToRelative(0.375f, 0.375f, 0f, isMoreThanHalf = true, isPositiveArc = true, -0.75f, 0f)
                arcToRelative(0.375f, 0.375f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, 0f)
                close()
            }
        }.build()

        return _ReceiptPercent!!
    }

@Suppress("ObjectPropertyName")
private var _ReceiptPercent: ImageVector? = null
