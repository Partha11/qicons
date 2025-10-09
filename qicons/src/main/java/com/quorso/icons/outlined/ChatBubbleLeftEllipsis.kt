package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.ChatBubbleLeftEllipsis: ImageVector
    get() {
        if (_ChatBubbleLeftEllipsis != null) {
            return _ChatBubbleLeftEllipsis!!
        }
        _ChatBubbleLeftEllipsis = ImageVector.Builder(
            name = "Outlined.ChatBubbleLeftEllipsis",
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
                moveTo(8.625f, 9.75f)
                arcToRelative(0.375f, 0.375f, 0f, isMoreThanHalf = true, isPositiveArc = true, -0.75f, 0f)
                arcToRelative(0.375f, 0.375f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, 0f)
                close()
                moveTo(8.625f, 9.75f)
                lineTo(8.25f, 9.75f)
                moveToRelative(4.125f, 0f)
                arcToRelative(0.375f, 0.375f, 0f, isMoreThanHalf = true, isPositiveArc = true, -0.75f, 0f)
                arcToRelative(0.375f, 0.375f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, 0f)
                close()
                moveTo(12.375f, 9.75f)
                lineTo(12f, 9.75f)
                moveToRelative(4.125f, 0f)
                arcToRelative(0.375f, 0.375f, 0f, isMoreThanHalf = true, isPositiveArc = true, -0.75f, 0f)
                arcToRelative(0.375f, 0.375f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, 0f)
                close()
                moveTo(16.125f, 9.75f)
                horizontalLineToRelative(-0.375f)
                moveToRelative(-13.5f, 3.01f)
                curveToRelative(0f, 1.6f, 1.123f, 2.994f, 2.707f, 3.227f)
                curveToRelative(1.087f, 0.16f, 2.185f, 0.283f, 3.293f, 0.369f)
                lineTo(8.25f, 21f)
                lineToRelative(4.184f, -4.183f)
                arcToRelative(1.14f, 1.14f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.778f, -0.332f)
                arcToRelative(48.294f, 48.294f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.83f, -0.498f)
                curveToRelative(1.585f, -0.233f, 2.708f, -1.626f, 2.708f, -3.228f)
                lineTo(21.75f, 6.741f)
                curveToRelative(0f, -1.602f, -1.123f, -2.995f, -2.707f, -3.228f)
                arcTo(48.394f, 48.394f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 3f)
                curveToRelative(-2.392f, 0f, -4.744f, 0.175f, -7.043f, 0.513f)
                curveTo(3.373f, 3.746f, 2.25f, 5.14f, 2.25f, 6.741f)
                verticalLineToRelative(6.018f)
                close()
            }
        }.build()

        return _ChatBubbleLeftEllipsis!!
    }

@Suppress("ObjectPropertyName")
private var _ChatBubbleLeftEllipsis: ImageVector? = null
