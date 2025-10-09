package com.quorso.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Filled.HomeModern: ImageVector
    get() {
        if (_HomeModern != null) {
            return _HomeModern!!
        }
        _HomeModern = ImageVector.Builder(
            name = "Filled.HomeModern",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.006f, 3.705f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, -0.512f, -1.41f)
                lineTo(6f, 6.838f)
                verticalLineTo(3f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.75f, -0.75f)
                horizontalLineToRelative(-1.5f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                verticalLineToRelative(4.93f)
                lineToRelative(-1.006f, 0.365f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.512f, 1.41f)
                lineToRelative(16.5f, -6f)
                close()
            }
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3.019f, 11.114f)
                lineTo(18f, 5.667f)
                verticalLineToRelative(3.421f)
                lineToRelative(4.006f, 1.457f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -0.512f, 1.41f)
                lineToRelative(-0.494f, -0.18f)
                verticalLineToRelative(8.475f)
                horizontalLineToRelative(0.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.5f)
                lineTo(2.25f, 21.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.5f)
                lineTo(3f, 20.25f)
                verticalLineToRelative(-9.129f)
                lineToRelative(0.019f, -0.007f)
                close()
                moveTo(18f, 20.25f)
                verticalLineToRelative(-9.566f)
                lineToRelative(1.5f, 0.546f)
                verticalLineToRelative(9.02f)
                lineTo(18f, 20.25f)
                close()
                moveTo(9f, 14.25f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.75f, 0.75f)
                verticalLineToRelative(4.5f)
                curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(3f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.75f, -0.75f)
                lineTo(12.75f, 15f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.75f, -0.75f)
                lineTo(9f, 14.25f)
                close()
            }
        }.build()

        return _HomeModern!!
    }

@Suppress("ObjectPropertyName")
private var _HomeModern: ImageVector? = null
