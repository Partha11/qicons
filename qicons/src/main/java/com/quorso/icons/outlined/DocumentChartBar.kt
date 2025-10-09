package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.DocumentChartBar: ImageVector
    get() {
        if (_DocumentChartBar != null) {
            return _DocumentChartBar!!
        }
        _DocumentChartBar = ImageVector.Builder(
            name = "Outlined.DocumentChartBar",
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
                horizontalLineTo(8.25f)
                moveTo(9f, 16.5f)
                verticalLineToRelative(0.75f)
                moveToRelative(3f, -3f)
                verticalLineToRelative(3f)
                moveTo(15f, 12f)
                verticalLineToRelative(5.25f)
                moveToRelative(-4.5f, -15f)
                horizontalLineTo(5.625f)
                curveToRelative(-0.621f, 0f, -1.125f, 0.504f, -1.125f, 1.125f)
                verticalLineToRelative(17.25f)
                curveToRelative(0f, 0.621f, 0.504f, 1.125f, 1.125f, 1.125f)
                horizontalLineToRelative(12.75f)
                curveToRelative(0.621f, 0f, 1.125f, -0.504f, 1.125f, -1.125f)
                verticalLineTo(11.25f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9f, -9f)
                close()
            }
        }.build()

        return _DocumentChartBar!!
    }

@Suppress("ObjectPropertyName")
private var _DocumentChartBar: ImageVector? = null
