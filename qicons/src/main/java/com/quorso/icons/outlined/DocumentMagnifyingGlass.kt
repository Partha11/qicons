package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.DocumentMagnifyingGlass: ImageVector
    get() {
        if (_DocumentMagnifyingGlass != null) {
            return _DocumentMagnifyingGlass!!
        }
        _DocumentMagnifyingGlass = ImageVector.Builder(
            name = "Outlined.DocumentMagnifyingGlass",
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
                moveTo(19.5f, 14.25f)
                verticalLineToRelative(-2.625f)
                arcToRelative(3.375f, 3.375f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.375f, -3.375f)
                horizontalLineToRelative(-1.5f)
                arcTo(1.125f, 1.125f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.5f, 7.125f)
                verticalLineToRelative(-1.5f)
                arcToRelative(3.375f, 3.375f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.375f, -3.375f)
                lineTo(8.25f, 2.25f)
                moveToRelative(5.231f, 13.481f)
                lineTo(15f, 17.25f)
                moveToRelative(-4.5f, -15f)
                lineTo(5.625f, 2.25f)
                curveToRelative(-0.621f, 0f, -1.125f, 0.504f, -1.125f, 1.125f)
                verticalLineToRelative(16.5f)
                curveToRelative(0f, 0.621f, 0.504f, 1.125f, 1.125f, 1.125f)
                horizontalLineToRelative(12.75f)
                curveToRelative(0.621f, 0f, 1.125f, -0.504f, 1.125f, -1.125f)
                lineTo(19.5f, 11.25f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9f, -9f)
                close()
                moveTo(14.25f, 13.875f)
                arcToRelative(2.625f, 2.625f, 0f, isMoreThanHalf = true, isPositiveArc = true, -5.25f, 0f)
                arcToRelative(2.625f, 2.625f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.25f, 0f)
                close()
            }
        }.build()

        return _DocumentMagnifyingGlass!!
    }

@Suppress("ObjectPropertyName")
private var _DocumentMagnifyingGlass: ImageVector? = null
